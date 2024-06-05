package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.InputText: ImageVector
    get() {
        if (_inputText != null) {
            return _inputText!!
        }
        _inputText = Builder(name = "InputText", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 9.0f)
                curveToRelative(-0.054f, 0.0f, -0.101f, 0.037f, -0.113f, 0.09f)
                lineToRelative(-0.906f, 3.91f)
                horizontalLineToRelative(2.039f)
                lineToRelative(-0.906f, -3.91f)
                curveToRelative(-0.012f, -0.053f, -0.059f, -0.09f, -0.113f, -0.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(9.947f, 17.0f)
                lineToRelative(-0.464f, -2.0f)
                horizontalLineToRelative(-2.967f)
                lineToRelative(-0.464f, 2.0f)
                horizontalLineToRelative(-2.053f)
                lineToRelative(1.939f, -8.362f)
                curveToRelative(0.287f, -1.237f, 1.625f, -2.008f, 2.937f, -1.458f)
                curveToRelative(0.627f, 0.263f, 1.049f, 0.866f, 1.202f, 1.528f)
                lineToRelative(1.922f, 8.291f)
                horizontalLineToRelative(-2.053f)
                close()
            }
        }
        .build()
        return _inputText!!
    }

private var _inputText: ImageVector? = null
