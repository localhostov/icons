package me.localx.icons.straight.bold

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

public val Icons.Bold.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.277f, 11.0f)
                horizontalLineTo(7.815f)
                lineTo(0.0f, 22.019f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(21.935f)
                close()
                moveTo(4.354f, 21.0f)
                lineToRelative(3.658f, -5.117f)
                curveToRelative(0.0f, 0.04f, -0.012f, 0.077f, -0.012f, 0.117f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, -0.077f, -0.018f, -0.148f, -0.023f, -0.224f)
                lineTo(19.667f, 21.0f)
                close()
                moveTo(2.0f, 6.0f)
                arcTo(3.005f, 3.005f, 0.0f, false, true, 4.518f, 3.039f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, true, 4.5f, -1.906f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 5.956f, 0.0f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, true, 4.5f, 1.906f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(4.164f)
                lineToRelative(-0.185f, -1.159f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -1.551f, -0.656f)
                lineToRelative(-1.318f, 0.931f)
                lineToRelative(-0.832f, -1.382f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, false, -2.556f, 0.0f)
                lineTo(9.89f, 5.116f)
                lineTo(8.572f, 4.185f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -1.551f, 0.656f)
                lineTo(6.836f, 6.0f)
                lineTo(11.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 6.0f)
                close()
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
