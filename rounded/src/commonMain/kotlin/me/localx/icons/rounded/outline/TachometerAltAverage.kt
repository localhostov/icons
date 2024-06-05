package me.localx.icons.rounded.outline

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

public val Icons.Outline.TachometerAltAverage: ImageVector
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
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.612f, 21.571f)
                arcTo(4.988f, 4.988f, 0.0f, false, false, 7.12f, 23.0f)
                horizontalLineToRelative(9.767f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, false, 3.354f, -1.288f)
                arcTo(12.054f, 12.054f, 0.0f, false, false, 20.0f, 4.052f)
                close()
                moveTo(18.868f, 20.259f)
                arcTo(2.862f, 2.862f, 0.0f, false, true, 16.887f, 21.0f)
                lineTo(7.12f, 21.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, -2.11f, -0.858f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 13.858f, 0.117f)
                close()
                moveTo(8.82f, 6.683f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.248f, 1.392f)
                arcToRelative(6.031f, 6.031f, 0.0f, false, false, -0.766f, 9.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4f, 1.43f)
                arcTo(8.042f, 8.042f, 0.0f, false, true, 7.427f, 6.435f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.82f, 6.683f)
                close()
                moveTo(20.0f, 13.0f)
                arcToRelative(7.932f, 7.932f, 0.0f, false, true, -2.408f, 5.715f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.43f)
                arcToRelative(6.031f, 6.031f, 0.0f, false, false, -0.765f, -9.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.144f, -1.64f)
                arcTo(8.008f, 8.008f, 0.0f, false, true, 20.0f, 13.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, -1.732f)
                lineTo(11.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.268f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltAverage!!
    }

private var _tachometerAltAverage: ImageVector? = null
