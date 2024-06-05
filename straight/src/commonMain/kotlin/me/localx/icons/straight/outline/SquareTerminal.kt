package me.localx.icons.straight.outline

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

public val Icons.Outline.SquareTerminal: ImageVector
    get() {
        if (_squareTerminal != null) {
            return _squareTerminal!!
        }
        _squareTerminal = Builder(name = "SquareTerminal", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.662f, 18.162f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(4.756f, -4.756f)
                lineTo(4.248f, 7.252f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(4.756f, 4.756f)
                curveToRelative(0.775f, 0.775f, 0.775f, 2.037f, 0.0f, 2.812f)
                lineToRelative(-4.756f, 4.756f)
                close()
                moveTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _squareTerminal!!
    }

private var _squareTerminal: ImageVector? = null
