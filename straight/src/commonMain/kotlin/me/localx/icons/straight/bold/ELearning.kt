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

public val Icons.Bold.ELearning: ImageVector
    get() {
        if (_eLearning != null) {
            return _eLearning!!
        }
        _eLearning = Builder(name = "ELearning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                lineTo(24.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 2.0f)
                lineTo(18.658f, 2.0f)
                arcTo(3.491f, 3.491f, 0.0f, false, false, 14.533f, 0.138f)
                lineTo(13.038f, 0.57f)
                arcTo(3.53f, 3.53f, 0.0f, false, false, 12.0f, 1.064f)
                arcTo(3.484f, 3.484f, 0.0f, false, false, 10.967f, 0.572f)
                lineTo(9.462f, 0.136f)
                arcTo(3.492f, 3.492f, 0.0f, false, false, 5.342f, 2.0f)
                lineTo(3.5f, 2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 5.5f)
                lineTo(0.0f, 19.0f)
                lineTo(10.5f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 21.0f)
                lineTo(13.5f, 21.0f)
                lineTo(13.5f, 19.0f)
                close()
                moveTo(13.5f, 3.936f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.367f, -0.483f)
                lineToRelative(1.495f, -0.432f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.8f, 3.1f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, true, 0.2f, 0.4f)
                lineTo(16.0f, 7.947f)
                lineToRelative(-2.5f, 0.717f)
                close()
                moveTo(8.0f, 3.5f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, true, 0.2f, -0.4f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, true, 0.434f, -0.083f)
                lineToRelative(1.505f, 0.436f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.362f, 0.481f)
                lineTo(10.501f, 8.664f)
                lineTo(8.0f, 7.947f)
                close()
                moveTo(3.0f, 5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(5.207f)
                lineToRelative(7.0f, 2.008f)
                lineToRelative(7.0f, -2.008f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(21.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                close()
            }
        }
        .build()
        return _eLearning!!
    }

private var _eLearning: ImageVector? = null
