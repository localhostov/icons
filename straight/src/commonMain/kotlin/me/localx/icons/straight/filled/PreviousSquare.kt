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

public val Icons.Filled.PreviousSquare: ImageVector
    get() {
        if (_previousSquare != null) {
            return _previousSquare!!
        }
        _previousSquare = Builder(name = "PreviousSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.0f, 17.647f)
                lineToRelative(-8.0f, -4.5f)
                verticalLineToRelative(4.352f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 6.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.353f)
                lineToRelative(8.0f, -4.5f)
                verticalLineToRelative(11.294f)
                close()
                moveTo(15.0f, 14.227f)
                lineToRelative(-3.96f, -2.228f)
                lineToRelative(3.96f, -2.227f)
                verticalLineToRelative(4.455f)
                close()
            }
        }
        .build()
        return _previousSquare!!
    }

private var _previousSquare: ImageVector? = null
