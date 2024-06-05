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

public val Icons.Filled.SquareW: ImageVector
    get() {
        if (_squareW != null) {
            return _squareW!!
        }
        _squareW = Builder(name = "SquareW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.854f, 17.828f)
                curveToRelative(-0.115f, 0.605f, -0.583f, 1.059f, -1.189f, 1.154f)
                curveToRelative(-0.609f, 0.093f, -1.204f, -0.208f, -1.473f, -0.693f)
                lineToRelative(-2.19f, -4.993f)
                lineToRelative(-2.137f, 4.879f)
                curveToRelative(-0.323f, 0.599f, -0.922f, 0.905f, -1.526f, 0.808f)
                curveToRelative(-0.608f, -0.096f, -1.076f, -0.549f, -1.191f, -1.146f)
                lineToRelative(-2.223f, -12.836f)
                horizontalLineToRelative(2.029f)
                lineToRelative(1.843f, 10.631f)
                lineToRelative(3.204f, -7.315f)
                lineToRelative(3.208f, 7.31f)
                lineToRelative(1.841f, -10.625f)
                horizontalLineToRelative(2.029f)
                lineToRelative(-2.223f, 12.828f)
                close()
            }
        }
        .build()
        return _squareW!!
    }

private var _squareW: ImageVector? = null
