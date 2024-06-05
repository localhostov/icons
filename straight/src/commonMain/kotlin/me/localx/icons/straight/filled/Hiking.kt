package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(16.618f)
                lineTo(15.447f, 7.658f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 12.764f, 6.0f)
                horizontalLineTo(9.253f)
                lineToRelative(-1.36f, 6.991f)
                arcTo(2.988f, 2.988f, 0.0f, false, false, 9.2f, 16.08f)
                lineTo(13.0f, 18.543f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(17.457f)
                lineToRelative(-2.27f, -1.473f)
                lineToRelative(1.294f, -6.7f)
                lineTo(15.382f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.96f, 17.64f)
                lineTo(6.874f, 24.0f)
                horizontalLineTo(8.915f)
                lineToRelative(0.846f, -5.174f)
                lineTo(8.115f, 17.757f)
                curveTo(8.06f, 17.722f, 8.014f, 17.677f, 7.96f, 17.64f)
                close()
                moveTo(5.93f, 12.61f)
                lineTo(7.085f, 6.676f)
                arcToRelative(7.677f, 7.677f, 0.0f, false, false, -4.065f, 6.3f)
                arcTo(2.764f, 2.764f, 0.0f, false, false, 5.689f, 16.0f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 0.734f, -0.107f)
                arcTo(4.974f, 4.974f, 0.0f, false, true, 5.93f, 12.61f)
                close()
                moveTo(15.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 13.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 2.5f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
