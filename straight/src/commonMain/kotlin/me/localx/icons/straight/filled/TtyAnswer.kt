package me.localx.icons.straight.filled

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

public val Icons.Filled.TtyAnswer: ImageVector
    get() {
        if (_ttyAnswer != null) {
            return _ttyAnswer!!
        }
        _ttyAnswer = Builder(name = "TtyAnswer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 0.0f)
                close()
                moveTo(16.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 0.0f)
                close()
                moveTo(12.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(24.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.613f, 12.848f)
                lineToRelative(-4.133f, 4.133f)
                curveToRelative(-2.96f, -1.282f, -5.08f, -3.407f, -6.453f, -6.469f)
                lineToRelative(4.125f, -4.125f)
                lineTo(4.887f, 0.122f)
                lineTo(1.717f, 3.292f)
                curveToRelative(-1.107f, 1.104f, -1.717f, 2.599f, -1.717f, 4.208f)
                curveToRelative(0.0f, 7.248f, 9.252f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.608f, 0.0f, 3.103f, -0.609f, 4.207f, -1.715f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.265f)
                close()
            }
        }
        .build()
        return _ttyAnswer!!
    }

private var _ttyAnswer: ImageVector? = null
