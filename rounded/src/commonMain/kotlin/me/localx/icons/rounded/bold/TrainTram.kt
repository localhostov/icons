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

public val Icons.Bold.TrainTram: ImageVector
    get() {
        if (_trainTram != null) {
            return _trainTram!!
        }
        _trainTram = Builder(name = "TrainTram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.94f)
                curveToRelative(2.574f, 0.203f, 4.488f, 0.85f, 4.51f, 0.857f)
                curveToRelative(0.162f, 0.057f, 0.327f, 0.083f, 0.49f, 0.083f)
                curveToRelative(0.621f, 0.0f, 1.203f, -0.389f, 1.417f, -1.01f)
                curveToRelative(0.271f, -0.782f, -0.144f, -1.637f, -0.927f, -1.907f)
                curveToRelative(-0.127f, -0.045f, -3.171f, -1.083f, -6.99f, -1.083f)
                reflectiveCurveTo(5.137f, 1.038f, 5.01f, 1.083f)
                curveToRelative(-0.783f, 0.271f, -1.198f, 1.125f, -0.927f, 1.907f)
                curveToRelative(0.271f, 0.784f, 1.129f, 1.201f, 1.907f, 0.927f)
                curveToRelative(0.023f, -0.007f, 1.922f, -0.655f, 4.51f, -0.857f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.468f, -5.5f, 5.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.259f, 1.37f, 4.205f, 3.323f, 5.05f)
                lineToRelative(-0.102f, 0.167f)
                curveToRelative(-0.433f, 0.706f, -0.211f, 1.63f, 0.496f, 2.062f)
                curveToRelative(0.244f, 0.149f, 0.515f, 0.221f, 0.782f, 0.221f)
                curveToRelative(0.504f, 0.0f, 0.997f, -0.255f, 1.28f, -0.717f)
                lineToRelative(0.786f, -1.283f)
                horizontalLineToRelative(4.87f)
                lineToRelative(0.786f, 1.283f)
                curveToRelative(0.283f, 0.462f, 0.775f, 0.717f, 1.28f, 0.717f)
                curveToRelative(0.268f, 0.0f, 0.538f, -0.071f, 0.782f, -0.221f)
                curveToRelative(0.707f, -0.433f, 0.929f, -1.356f, 0.496f, -2.062f)
                lineToRelative(-0.102f, -0.167f)
                curveToRelative(1.953f, -0.845f, 3.323f, -2.791f, 3.323f, -5.05f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(6.0f, 13.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.171f, 0.017f, -0.338f, 0.05f, -0.5f)
                horizontalLineToRelative(4.45f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 13.0f)
                close()
                moveTo(13.5f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.45f)
                curveToRelative(0.033f, 0.162f, 0.05f, 0.329f, 0.05f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(15.5f, 19.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _trainTram!!
    }

private var _trainTram: ImageVector? = null
