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

public val Icons.Filled.SquareSmall: ImageVector
    get() {
        if (_squareSmall != null) {
            return _squareSmall!!
        }
        _squareSmall = Builder(name = "SquareSmall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 19.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _squareSmall!!
    }

private var _squareSmall: ImageVector? = null
