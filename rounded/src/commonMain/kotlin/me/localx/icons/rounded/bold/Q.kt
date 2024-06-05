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

public val Icons.Bold.Q: ImageVector
    get() {
        if (_q != null) {
            return _q!!
        }
        _q = Builder(name = "Q", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.561f, 21.439f)
                lineToRelative(-2.128f, -2.128f)
                curveToRelative(0.987f, -1.564f, 1.568f, -3.414f, 1.568f, -5.402f)
                verticalLineToRelative(-3.818f)
                curveTo(21.495f, -3.282f, 2.501f, -3.271f, 2.0f, 10.091f)
                verticalLineToRelative(3.818f)
                curveToRelative(-0.121f, 8.476f, 10.196f, 13.261f, 16.469f, 7.681f)
                lineToRelative(1.97f, 1.97f)
                curveToRelative(1.393f, 1.381f, 3.502f, -0.729f, 2.121f, -2.121f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.181f, -7.0f, -7.091f)
                verticalLineToRelative(-3.818f)
                curveToRelative(0.297f, -9.374f, 13.707f, -9.367f, 14.0f, 0.0f)
                verticalLineToRelative(3.818f)
                curveToRelative(0.0f, 1.154f, -0.279f, 2.241f, -0.764f, 3.205f)
                lineToRelative(-1.675f, -1.675f)
                curveToRelative(-1.393f, -1.381f, -3.502f, 0.729f, -2.121f, 2.121f)
                lineToRelative(1.901f, 1.901f)
                curveToRelative(-1.194f, 0.96f, -2.701f, 1.538f, -4.341f, 1.538f)
                close()
            }
        }
        .build()
        return _q!!
    }

private var _q: ImageVector? = null
