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

public val Icons.Bold.FunctionSquare: ImageVector
    get() {
        if (_functionSquare != null) {
            return _functionSquare!!
        }
        _functionSquare = Builder(name = "FunctionSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(10.0f, 4.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.414f, 0.0f, -0.75f, 0.337f, -0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.792f, 1.458f, -3.25f, 3.25f, -3.25f)
                close()
                moveTo(19.687f, 11.0f)
                lineToRelative(-2.446f, 4.0f)
                lineToRelative(2.446f, 4.0f)
                horizontalLineToRelative(-2.931f)
                lineToRelative(-0.981f, -1.604f)
                lineToRelative(-0.981f, 1.604f)
                horizontalLineToRelative(-2.931f)
                lineToRelative(2.446f, -4.0f)
                lineToRelative(-2.446f, -4.0f)
                horizontalLineToRelative(2.931f)
                lineToRelative(0.981f, 1.604f)
                lineToRelative(0.981f, -1.604f)
                horizontalLineToRelative(2.931f)
                close()
            }
        }
        .build()
        return _functionSquare!!
    }

private var _functionSquare: ImageVector? = null
