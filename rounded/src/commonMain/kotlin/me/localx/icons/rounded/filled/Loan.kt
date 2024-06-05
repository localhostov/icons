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

public val Icons.Filled.Loan: ImageVector
    get() {
        if (_loan != null) {
            return _loan!!
        }
        _loan = Builder(name = "Loan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.003f, 6.081f)
                curveToRelative(0.0f, -1.665f, 1.583f, -3.475f, 3.14f, -4.224f)
                curveToRelative(-0.183f, -0.183f, -0.359f, -0.383f, -0.51f, -0.598f)
                curveToRelative(-0.372f, -0.528f, 0.049f, -1.259f, 0.695f, -1.259f)
                horizontalLineToRelative(2.347f)
                curveToRelative(0.683f, 0.0f, 1.056f, 0.776f, 0.651f, 1.326f)
                curveToRelative(-0.14f, 0.19f, -0.298f, 0.368f, -0.462f, 0.531f)
                curveToRelative(1.557f, 0.75f, 3.138f, 2.559f, 3.138f, 4.223f)
                curveToRelative(0.0f, 1.61f, -1.233f, 2.919f, -2.75f, 2.919f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.517f, 0.0f, -2.75f, -1.31f, -2.75f, -2.919f)
                close()
                moveTo(23.151f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.252f, 0.596f)
                curveToRelative(-0.547f, 0.078f, -1.053f, -0.302f, -1.131f, -0.848f)
                curveToRelative(-0.078f, -0.547f, 0.302f, -1.053f, 0.848f, -1.131f)
                lineToRelative(4.162f, -0.583f)
                curveToRelative(0.936f, -0.134f, 1.748f, -0.806f, 1.94f, -1.732f)
                curveToRelative(0.296f, -1.425f, -0.79f, -2.685f, -2.164f, -2.685f)
                horizontalLineToRelative(-7.787f)
                curveTo(1.794f, 11.0f, 0.003f, 12.791f, 0.003f, 15.0f)
                verticalLineToRelative(5.0f)
                curveTo(0.003f, 22.209f, 1.794f, 24.0f, 4.003f, 24.0f)
                horizontalLineToRelative(4.262f)
                curveToRelative(2.805f, 0.0f, 5.48f, -1.178f, 7.374f, -3.246f)
                lineToRelative(7.702f, -8.409f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
            }
        }
        .build()
        return _loan!!
    }

private var _loan: ImageVector? = null
