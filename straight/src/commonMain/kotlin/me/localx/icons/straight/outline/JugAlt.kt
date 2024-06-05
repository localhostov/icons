package me.localx.icons.straight.outline

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

public val Icons.Outline.JugAlt: ImageVector
    get() {
        if (_jugAlt != null) {
            return _jugAlt!!
        }
        _jugAlt = Builder(name = "JugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 4.0f)
                curveToRelative(-1.129f, 0.0f, -2.204f, 0.442f, -2.947f, 1.213f)
                curveToRelative(-0.374f, 0.387f, -0.654f, 0.845f, -0.831f, 1.342f)
                lineToRelative(-0.499f, -0.582f)
                curveToRelative(-0.466f, -0.544f, -0.723f, -1.237f, -0.723f, -1.953f)
                verticalLineToRelative(-2.021f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.021f)
                curveToRelative(0.0f, 0.715f, -0.256f, 1.409f, -0.722f, 1.952f)
                lineToRelative(-4.074f, 4.753f)
                curveToRelative(-0.776f, 0.906f, -1.204f, 2.062f, -1.204f, 3.253f)
                verticalLineToRelative(10.021f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-10.021f)
                curveToRelative(0.0f, -0.035f, 0.0f, -0.07f, -0.001f, -0.106f)
                curveToRelative(1.724f, -0.445f, 3.001f, -2.013f, 3.001f, -3.874f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.165f, 13.0f)
                curveToRelative(0.122f, -0.354f, 0.31f, -0.684f, 0.557f, -0.973f)
                lineToRelative(4.074f, -4.753f)
                curveToRelative(0.776f, -0.906f, 1.204f, -2.062f, 1.204f, -3.253f)
                verticalLineToRelative(-2.021f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.021f)
                curveToRelative(0.0f, 1.192f, 0.427f, 2.348f, 1.204f, 3.254f)
                lineToRelative(4.073f, 4.752f)
                curveToRelative(0.466f, 0.544f, 0.723f, 1.237f, 0.723f, 1.953f)
                verticalLineToRelative(8.021f)
                close()
                moveTo(21.0f, 10.0f)
                curveToRelative(0.0f, 0.91f, -0.611f, 1.679f, -1.444f, 1.921f)
                curveToRelative(-0.194f, -0.429f, -0.449f, -0.832f, -0.76f, -1.195f)
                lineToRelative(-1.796f, -2.096f)
                verticalLineToRelative(-0.665f)
                curveToRelative(-0.019f, -0.538f, 0.151f, -1.009f, 0.493f, -1.362f)
                curveToRelative(0.368f, -0.383f, 0.918f, -0.602f, 1.508f, -0.602f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _jugAlt!!
    }

private var _jugAlt: ImageVector? = null
