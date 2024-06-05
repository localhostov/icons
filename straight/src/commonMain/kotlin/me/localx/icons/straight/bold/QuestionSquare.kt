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

public val Icons.Bold.QuestionSquare: ImageVector
    get() {
        if (_questionSquare != null) {
            return _questionSquare!!
        }
        _questionSquare = Builder(name = "QuestionSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.619f)
                curveToRelative(0.0f, -1.375f, 0.852f, -2.881f, 1.98f, -3.503f)
                curveToRelative(0.291f, -0.16f, 0.596f, -0.537f, 0.502f, -1.071f)
                curveToRelative(-0.067f, -0.383f, -0.406f, -0.722f, -0.789f, -0.789f)
                curveToRelative(-0.418f, -0.076f, -0.703f, 0.104f, -0.836f, 0.216f)
                curveToRelative(-0.227f, 0.191f, -0.357f, 0.47f, -0.357f, 0.767f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.302f, 1.428f, -3.064f)
                curveToRelative(0.907f, -0.762f, 2.103f, -1.081f, 3.284f, -0.874f)
                curveToRelative(1.615f, 0.283f, 2.942f, 1.61f, 3.225f, 3.225f)
                curveToRelative(0.298f, 1.696f, -0.509f, 3.391f, -2.008f, 4.217f)
                curveToRelative(-0.168f, 0.102f, -0.429f, 0.59f, -0.429f, 0.876f)
                verticalLineToRelative(0.619f)
                close()
                moveTo(13.5f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                lineTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                close()
            }
        }
        .build()
        return _questionSquare!!
    }

private var _questionSquare: ImageVector? = null
