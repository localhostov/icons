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

public val Icons.Bold.ConvertDocument: ImageVector
    get() {
        if (_convertDocument != null) {
            return _convertDocument!!
        }
        _convertDocument = Builder(name = "ConvertDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.57f, 1.57f, 1.0f, 3.5f, 1.0f)
                horizontalLineToRelative(2.761f)
                curveToRelative(-0.687f, 0.831f, -1.133f, 1.867f, -1.235f, 3.0f)
                horizontalLineToRelative(-1.525f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(11.0f, 17.516f)
                lineToRelative(3.65f, -3.183f)
                curveToRelative(0.494f, -0.443f, 0.494f, -1.217f, 0.0f, -1.66f)
                lineToRelative(-3.65f, -3.157f)
                verticalLineToRelative(2.484f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.516f)
                close()
                moveTo(22.984f, 5.641f)
                lineToRelative(-3.576f, -3.605f)
                curveToRelative(-0.652f, -0.658f, -1.558f, -1.036f, -2.485f, -1.036f)
                horizontalLineToRelative(-6.423f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-14.894f)
                curveToRelative(0.0f, -0.929f, -0.36f, -1.804f, -1.016f, -2.465f)
                close()
            }
        }
        .build()
        return _convertDocument!!
    }

private var _convertDocument: ImageVector? = null
