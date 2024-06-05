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

public val Icons.Filled.ELearning: ImageVector
    get() {
        if (_eLearning != null) {
            return _eLearning!!
        }
        _eLearning = Builder(name = "ELearning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 7.938f)
                verticalLineToRelative(-4.765f)
                curveToRelative(0.0f, -1.2f, 0.634f, -3.167f, 3.673f, -3.167f)
                arcToRelative(8.613f, 8.613f, 0.0f, false, true, 1.183f, 0.094f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, true, 2.144f, 2.848f)
                verticalLineToRelative(7.925f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-7.925f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, true, 2.144f, -2.848f)
                arcToRelative(8.613f, 8.613f, 0.0f, false, true, 1.183f, -0.09f)
                curveToRelative(3.039f, -0.004f, 3.673f, 1.963f, 3.673f, 3.163f)
                verticalLineToRelative(4.765f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, true, -2.9f, 3.845f)
                lineToRelative(-3.451f, 0.987f)
                arcToRelative(6.019f, 6.019f, 0.0f, false, true, -3.3f, 0.0f)
                lineToRelative(-3.449f, -0.987f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, true, -2.9f, -3.845f)
                close()
                moveTo(22.0f, 4.026f)
                verticalLineToRelative(3.912f)
                arcToRelative(6.022f, 6.022f, 0.0f, false, true, -4.353f, 5.768f)
                lineToRelative(-3.449f, 0.986f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.394f, 0.0f)
                lineToRelative(-3.452f, -0.987f)
                arcToRelative(6.023f, 6.023f, 0.0f, false, true, -4.352f, -5.767f)
                verticalLineToRelative(-3.912f)
                arcToRelative(4.977f, 4.977f, 0.0f, false, false, -2.0f, 3.974f)
                verticalLineToRelative(7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(4.977f, 4.977f, 0.0f, false, false, -2.0f, -3.974f)
                close()
            }
        }
        .build()
        return _eLearning!!
    }

private var _eLearning: ImageVector? = null
