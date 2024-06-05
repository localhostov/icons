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

public val Icons.Bold.ArrowUpFromSquare: ImageVector
    get() {
        if (_arrowUpFromSquare != null) {
            return _arrowUpFromSquare!!
        }
        _arrowUpFromSquare = Builder(name = "ArrowUpFromSquare", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.604f, 8.016f)
                lineToRelative(-2.207f, -2.032f)
                lineTo(10.189f, 0.777f)
                curveToRelative(1.017f, -1.019f, 2.604f, -1.02f, 3.578f, -0.045f)
                lineToRelative(4.836f, 5.252f)
                lineToRelative(-2.207f, 2.032f)
                lineToRelative(-2.896f, -3.147f)
                verticalLineToRelative(11.131f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 4.868f)
                lineToRelative(-2.896f, 3.148f)
                close()
                moveTo(21.206f, 6.307f)
                lineToRelative(-2.233f, 2.056f)
                curveToRelative(0.013f, 0.044f, 0.028f, 0.088f, 0.028f, 0.137f)
                verticalLineToRelative(12.5f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 8.5f)
                curveToRelative(0.0f, -0.049f, 0.015f, -0.092f, 0.028f, -0.137f)
                lineToRelative(-2.233f, -2.056f)
                curveToRelative(-0.489f, 0.602f, -0.794f, 1.359f, -0.794f, 2.193f)
                verticalLineToRelative(15.5f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 8.5f)
                curveToRelative(0.0f, -0.834f, -0.305f, -1.591f, -0.794f, -2.193f)
                close()
            }
        }
        .build()
        return _arrowUpFromSquare!!
    }

private var _arrowUpFromSquare: ImageVector? = null
