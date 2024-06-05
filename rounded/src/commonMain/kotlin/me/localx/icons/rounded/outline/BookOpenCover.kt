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

public val Icons.Outline.BookOpenCover: ImageVector
    get() {
        if (_bookOpenCover != null) {
            return _bookOpenCover!!
        }
        _bookOpenCover = Builder(name = "BookOpenCover", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(14.04f)
                curveToRelative(0.0f, 2.22f, -1.491f, 4.197f, -3.626f, 4.808f)
                lineToRelative(-6.726f, 1.921f)
                curveToRelative(-1.078f, 0.308f, -2.218f, 0.308f, -3.296f, 0.0f)
                lineToRelative(-6.726f, -1.921f)
                curveToRelative(-2.135f, -0.61f, -3.626f, -2.587f, -3.626f, -4.808f)
                lineTo(0.0f, 4.0f)
                curveToRelative(0.006f, -1.308f, 1.994f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(13.04f)
                curveToRelative(0.0f, 1.333f, 0.895f, 2.519f, 2.176f, 2.885f)
                lineToRelative(6.726f, 1.921f)
                curveToRelative(0.719f, 0.205f, 1.478f, 0.205f, 2.198f, 0.0f)
                lineToRelative(6.725f, -1.921f)
                curveToRelative(1.281f, -0.366f, 2.176f, -1.552f, 2.176f, -2.885f)
                lineTo(22.001f, 3.0f)
                curveToRelative(0.006f, -1.308f, 1.994f, -1.307f, 2.0f, 0.0f)
                close()
                moveTo(4.0f, 14.937f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.267f, 0.58f, -2.431f, 1.591f, -3.193f)
                curveTo(6.602f, 0.044f, 7.88f, -0.194f, 9.099f, 0.154f)
                lineToRelative(1.726f, 0.493f)
                curveToRelative(0.446f, 0.127f, 0.845f, 0.354f, 1.176f, 0.651f)
                curveToRelative(0.331f, -0.297f, 0.73f, -0.524f, 1.176f, -0.651f)
                lineToRelative(1.725f, -0.493f)
                curveToRelative(2.461f, -0.778f, 5.171f, 1.268f, 5.099f, 3.846f)
                lineTo(20.001f, 14.937f)
                curveToRelative(0.0f, 1.776f, -1.193f, 3.358f, -2.901f, 3.846f)
                lineToRelative(-3.451f, 0.986f)
                curveToRelative(-1.079f, 0.308f, -2.219f, 0.308f, -3.296f, 0.0f)
                lineToRelative(-3.451f, -0.986f)
                curveToRelative(-1.708f, -0.488f, -2.901f, -2.07f, -2.901f, -3.846f)
                close()
                moveTo(13.0f, 17.873f)
                curveToRelative(0.033f, -0.009f, 3.549f, -1.013f, 3.549f, -1.013f)
                curveToRelative(0.854f, -0.244f, 1.451f, -1.035f, 1.451f, -1.923f)
                lineTo(18.0f, 4.0f)
                curveToRelative(0.0f, -0.633f, -0.29f, -1.215f, -0.795f, -1.597f)
                curveToRelative(-0.508f, -0.384f, -1.151f, -0.499f, -1.754f, -0.327f)
                lineToRelative(-1.725f, 0.493f)
                curveToRelative(-0.427f, 0.122f, -0.726f, 0.517f, -0.726f, 0.961f)
                verticalLineToRelative(14.342f)
                close()
                moveTo(6.0f, 14.937f)
                curveToRelative(0.0f, 0.888f, 0.597f, 1.679f, 1.451f, 1.923f)
                curveToRelative(0.0f, 0.0f, 3.516f, 1.004f, 3.549f, 1.013f)
                lineTo(11.0f, 3.531f)
                curveToRelative(0.0f, -0.444f, -0.298f, -0.839f, -0.725f, -0.961f)
                lineToRelative(-1.726f, -0.493f)
                curveToRelative(-0.603f, -0.173f, -1.247f, -0.057f, -1.754f, 0.327f)
                curveToRelative(-0.505f, 0.381f, -0.795f, 0.963f, -0.795f, 1.597f)
                lineTo(6.0f, 14.937f)
                close()
            }
        }
        .build()
        return _bookOpenCover!!
    }

private var _bookOpenCover: ImageVector? = null
