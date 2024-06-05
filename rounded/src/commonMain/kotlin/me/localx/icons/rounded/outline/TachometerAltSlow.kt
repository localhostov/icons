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

public val Icons.Outline.TachometerAltSlow: ImageVector
    get() {
        if (_tachometerAltSlow != null) {
            return _tachometerAltSlow!!
        }
        _tachometerAltSlow = Builder(name = "TachometerAltSlow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.052f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.612f, 21.572f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 7.12f, 23.0f)
                horizontalLineToRelative(9.767f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, false, 3.354f, -1.288f)
                arcTo(12.053f, 12.053f, 0.0f, false, false, 20.0f, 4.052f)
                close()
                moveTo(18.868f, 20.259f)
                arcTo(2.862f, 2.862f, 0.0f, false, true, 16.887f, 21.0f)
                horizontalLineTo(7.12f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.11f, -0.858f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 13.858f, 0.117f)
                close()
                moveTo(20.0f, 13.0f)
                arcToRelative(7.932f, 7.932f, 0.0f, false, true, -2.408f, 5.715f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.43f)
                curveToRelative(4.141f, -3.956f, 0.6f, -11.095f, -5.05f, -10.223f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.286f, -1.981f)
                arcTo(8.026f, 8.026f, 0.0f, false, true, 20.0f, 13.0f)
                close()
                moveTo(7.806f, 17.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 1.432f)
                arcToRelative(7.973f, 7.973f, 0.0f, false, true, -2.327f, -6.859f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.981f, 0.286f)
                arcTo(5.966f, 5.966f, 0.0f, false, false, 7.806f, 17.284f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.932f, -0.518f)
                lineTo(6.293f, 8.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.707f, 7.293f)
                lineToRelative(3.775f, 3.775f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 14.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltSlow!!
    }

private var _tachometerAltSlow: ImageVector? = null
