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

public val Icons.Bold.Forklift: ImageVector
    get() {
        if (_forklift != null) {
            return _forklift!!
        }
        _forklift = Builder(name = "Forklift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 18.0f)
                lineTo(22.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.189f)
                lineToRelative(-2.019f, -10.187f)
                curveToRelative(-0.326f, -1.631f, -1.77f, -2.813f, -3.432f, -2.813f)
                lineTo(3.5f, -0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(17.5f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.594f, -3.0f)
                horizontalLineToRelative(2.594f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(6.86f)
                curveToRelative(0.238f, 0.0f, 0.444f, 0.169f, 0.491f, 0.401f)
                lineToRelative(1.92f, 9.599f)
                horizontalLineToRelative(-2.634f)
                lineToRelative(-0.125f, -0.446f)
                curveToRelative(-0.422f, -1.504f, -1.808f, -2.554f, -3.37f, -2.554f)
                horizontalLineToRelative(-3.642f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(13.771f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.642f)
                curveToRelative(0.223f, 0.0f, 0.421f, 0.15f, 0.481f, 0.364f)
                lineToRelative(0.74f, 2.636f)
                horizontalLineToRelative(5.507f)
                lineToRelative(0.4f, 2.0f)
                close()
            }
        }
        .build()
        return _forklift!!
    }

private var _forklift: ImageVector? = null
