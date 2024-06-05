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

public val Icons.Bold.HeadSideHeadphones: ImageVector
    get() {
        if (_headSideHeadphones != null) {
            return _headSideHeadphones!!
        }
        _headSideHeadphones = Builder(name = "HeadSideHeadphones", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.198f, 10.864f)
                curveToRelative(-1.12f, -2.58f, -2.178f, -5.017f, -3.32f, -6.428f)
                curveTo(17.392f, 1.117f, 13.297f, -0.521f, 9.179f, 0.153f)
                curveTo(4.947f, 0.852f, 1.495f, 3.97f, 0.384f, 8.099f)
                curveToRelative(-0.938f, 3.486f, -0.113f, 7.118f, 2.262f, 9.962f)
                curveToRelative(0.226f, 0.271f, 0.35f, 0.609f, 0.35f, 0.954f)
                verticalLineToRelative(4.985f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.894f)
                curveToRelative(1.739f, 0.0f, 3.229f, -1.3f, 3.468f, -3.022f)
                lineToRelative(0.341f, -2.478f)
                horizontalLineToRelative(2.298f)
                verticalLineToRelative(-2.817f)
                reflectiveCurveToRelative(-0.574f, -1.306f, -0.797f, -1.818f)
                close()
                moveTo(19.082f, 12.5f)
                lineToRelative(-0.698f, 5.067f)
                curveToRelative(-0.033f, 0.247f, -0.247f, 0.433f, -0.495f, 0.433f)
                horizontalLineToRelative(-3.894f)
                verticalLineToRelative(3.0f)
                lineTo(5.995f, 21.0f)
                verticalLineToRelative(-1.985f)
                curveToRelative(0.0f, -1.046f, -0.372f, -2.067f, -1.047f, -2.876f)
                curveToRelative(-1.74f, -2.085f, -2.348f, -4.73f, -1.668f, -7.261f)
                curveToRelative(0.735f, -2.73f, 2.989f, -4.917f, 5.72f, -5.623f)
                verticalLineToRelative(3.002f)
                curveToRelative(-1.746f, 0.619f, -3.0f, 2.287f, -3.0f, 4.243f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -1.956f, -1.254f, -3.624f, -3.0f, -4.243f)
                verticalLineToRelative(-3.192f)
                curveToRelative(2.158f, 0.266f, 4.148f, 1.393f, 5.512f, 3.214f)
                curveToRelative(0.92f, 1.138f, 1.944f, 3.497f, 2.935f, 5.779f)
                curveToRelative(0.064f, 0.147f, 0.128f, 0.295f, 0.192f, 0.441f)
                horizontalLineToRelative(-1.557f)
                close()
            }
        }
        .build()
        return _headSideHeadphones!!
    }

private var _headSideHeadphones: ImageVector? = null
