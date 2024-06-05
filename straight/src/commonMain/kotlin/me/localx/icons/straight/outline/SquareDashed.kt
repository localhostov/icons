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

public val Icons.Outline.SquareDashed: ImageVector
    get() {
        if (_squareDashed != null) {
            return _squareDashed!!
        }
        _squareDashed = Builder(name = "SquareDashed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(2.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(22.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _squareDashed!!
    }

private var _squareDashed: ImageVector? = null
