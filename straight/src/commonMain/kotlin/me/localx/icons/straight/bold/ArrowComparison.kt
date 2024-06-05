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

public val Icons.Bold.ArrowComparison: ImageVector
    get() {
        if (_arrowComparison != null) {
            return _arrowComparison!!
        }
        _arrowComparison = Builder(name = "ArrowComparison", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.839f, 10.041f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-8.96f, 8.959f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(-5.439f, 5.439f)
                lineToRelative(2.439f, 2.439f)
                lineTo(1.091f, 23.999f)
                curveToRelative(-0.603f, 0.0f, -1.091f, -0.488f, -1.091f, -1.091f)
                verticalLineToRelative(-5.909f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(7.561f, -7.561f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(6.839f, -6.838f)
                close()
                moveTo(22.909f, 0.0f)
                horizontalLineToRelative(-5.909f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-5.439f, 5.439f)
                lineToRelative(-5.0f, -5.0f)
                lineTo(0.056f, 11.823f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(6.823f, -6.823f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(7.561f, -7.561f)
                lineToRelative(2.439f, 2.439f)
                lineTo(24.0f, 1.091f)
                curveToRelative(0.0f, -0.602f, -0.488f, -1.091f, -1.091f, -1.091f)
                close()
            }
        }
        .build()
        return _arrowComparison!!
    }

private var _arrowComparison: ImageVector? = null
