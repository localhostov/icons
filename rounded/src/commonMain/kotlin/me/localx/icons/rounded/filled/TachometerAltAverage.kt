package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.TachometerAltAverage: ImageVector
    get() {
        if (_tachometerAltAverage != null) {
            return _tachometerAltAverage!!
        }
        _tachometerAltAverage = Builder(name = "TachometerAltAverage", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.052f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.611f, 21.571f)
                arcTo(4.991f, 4.991f, 0.0f, false, false, 7.12f, 23.0f)
                horizontalLineToRelative(9.766f)
                arcToRelative(4.841f, 4.841f, 0.0f, false, false, 3.355f, -1.288f)
                arcTo(12.053f, 12.053f, 0.0f, false, false, 20.0f, 4.052f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -3.723f)
                lineTo(11.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.277f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(17.953f, 19.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.324f, -1.5f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 19.0f, 13.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -3.5f, -6.065f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.731f)
                arcTo(9.011f, 9.011f, 0.0f, false, true, 17.953f, 19.75f)
                close()
                moveTo(3.0f, 13.0f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.006f, -0.028f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 7.5f, 5.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.731f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 2.371f, 5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.324f, 1.5f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltAverage!!
    }

private var _tachometerAltAverage: ImageVector? = null
