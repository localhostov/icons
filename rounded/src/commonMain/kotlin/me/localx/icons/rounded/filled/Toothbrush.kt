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

public val Icons.Filled.Toothbrush: ImageVector
    get() {
        if (_toothbrush != null) {
            return _toothbrush!!
        }
        _toothbrush = Builder(name = "Toothbrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                verticalLineToRelative(-0.412f)
                curveToRelative(0.0f, -0.627f, -0.373f, -1.191f, -0.951f, -1.439f)
                curveToRelative(-0.568f, -0.241f, -1.222f, -0.126f, -1.669f, 0.299f)
                curveToRelative(-0.372f, 0.356f, -0.862f, 0.553f, -1.38f, 0.553f)
                lineTo(6.693f, 2.001f)
                curveTo(3.801f, 2.0f, 1.244f, 3.738f, 0.181f, 6.43f)
                curveToRelative(-0.314f, 0.794f, -0.212f, 1.693f, 0.273f, 2.406f)
                curveToRelative(0.495f, 0.729f, 1.315f, 1.164f, 2.194f, 1.164f)
                horizontalLineToRelative(0.352f)
                verticalLineToRelative(8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.263f)
                curveToRelative(1.811f, -1.267f, 3.0f, -3.364f, 3.0f, -5.737f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.694f, 0.0f, 1.364f, -0.105f, 1.998f, -0.294f)
                verticalLineToRelative(8.294f)
                close()
            }
        }
        .build()
        return _toothbrush!!
    }

private var _toothbrush: ImageVector? = null
