package me.localx.icons.rounded.bold

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

public val Icons.Bold.Lesson: ImageVector
    get() {
        if (_lesson != null) {
            return _lesson!!
        }
        _lesson = Builder(name = "Lesson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.996f, 14.981f)
                curveToRelative(0.0f, 0.007f, 0.004f, 6.019f, 0.004f, 6.019f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.179f)
                lineToRelative(-3.433f, 1.786f)
                curveToRelative(-0.982f, 0.511f, -2.152f, 0.511f, -3.134f, 0.0f)
                lineToRelative(-4.739f, -2.466f)
                curveToRelative(-0.924f, -0.481f, -0.924f, -1.803f, 0.0f, -2.284f)
                lineToRelative(4.739f, -2.466f)
                curveToRelative(0.982f, -0.511f, 2.152f, -0.511f, 3.134f, 0.0f)
                lineToRelative(4.739f, 2.466f)
                curveToRelative(0.456f, 0.237f, 0.684f, 0.679f, 0.691f, 1.123f)
                close()
                moveTo(12.0f, 20.995f)
                curveToRelative(-0.802f, 0.0f, -1.604f, -0.221f, -2.304f, -0.662f)
                lineToRelative(-1.696f, -1.072f)
                verticalLineToRelative(2.314f)
                curveToRelative(0.0f, 0.746f, 0.41f, 1.43f, 1.072f, 1.775f)
                curveToRelative(0.645f, 0.336f, 1.602f, 0.65f, 2.928f, 0.65f)
                reflectiveCurveToRelative(2.284f, -0.314f, 2.928f, -0.65f)
                curveToRelative(0.662f, -0.345f, 1.072f, -1.029f, 1.072f, -1.775f)
                verticalLineToRelative(-2.315f)
                lineToRelative(-1.695f, 1.071f)
                curveToRelative(-0.7f, 0.442f, -1.502f, 0.663f, -2.305f, 0.663f)
                close()
                moveTo(24.0f, 4.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.142f, 0.771f, 2.138f, 1.874f, 2.422f)
                curveToRelative(0.802f, 0.206f, 1.285f, 1.024f, 1.079f, 1.826f)
                curveToRelative(-0.174f, 0.677f, -0.784f, 1.126f, -1.452f, 1.126f)
                curveToRelative(-0.124f, 0.0f, -0.25f, -0.015f, -0.375f, -0.048f)
                curveToRelative(-2.429f, -0.625f, -4.126f, -2.815f, -4.126f, -5.326f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.015f, 2.015f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                close()
                moveTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(11.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _lesson!!
    }

private var _lesson: ImageVector? = null
