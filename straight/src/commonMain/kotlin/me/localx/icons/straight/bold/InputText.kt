package me.localx.icons.straight.bold

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

public val Icons.Bold.InputText: ImageVector
    get() {
        if (_inputText != null) {
            return _inputText!!
        }
        _inputText = Builder(name = "InputText", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.876f, 7.18f)
                curveToRelative(-1.313f, -0.55f, -2.651f, 0.221f, -2.937f, 1.458f)
                lineToRelative(-1.939f, 8.362f)
                horizontalLineToRelative(2.053f)
                lineToRelative(0.468f, -2.019f)
                horizontalLineToRelative(2.958f)
                lineToRelative(0.468f, 2.019f)
                horizontalLineToRelative(2.053f)
                lineToRelative(-1.922f, -8.291f)
                curveToRelative(-0.154f, -0.662f, -0.575f, -1.266f, -1.202f, -1.528f)
                close()
                moveTo(6.985f, 12.981f)
                lineToRelative(0.902f, -3.891f)
                curveToRelative(0.012f, -0.053f, 0.059f, -0.09f, 0.113f, -0.09f)
                reflectiveCurveToRelative(0.101f, 0.037f, 0.113f, 0.09f)
                lineToRelative(0.902f, 3.891f)
                horizontalLineToRelative(-2.031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
            }
        }
        .build()
        return _inputText!!
    }

private var _inputText: ImageVector? = null
