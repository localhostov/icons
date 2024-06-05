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

public val Icons.Filled.Javascript: ImageVector
    get() {
        if (_javascript != null) {
            return _javascript!!
        }
        _javascript = Builder(name = "Javascript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 19.0f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, 4.414f)
                verticalLineToRelative(-4.414f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(7.5f, 5.0f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(4.068f)
                curveToRelative(-0.001f, 0.449f, -0.359f, 0.751f, -0.75f, 0.751f)
                curveToRelative(-0.408f, -0.007f, -0.75f, -0.34f, -0.75f, -0.735f)
                curveToRelative(0.0f, -0.03f, 0.005f, -0.084f, 0.005f, -0.084f)
                horizontalLineToRelative(-1.255f)
                verticalLineToRelative(0.084f)
                curveToRelative(0.0f, 1.09f, 0.896f, 1.977f, 2.0f, 1.984f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.109f, 0.001f, 2.0f, -0.889f, 2.0f, -1.984f)
                verticalLineToRelative(-4.084f)
                close()
                moveTo(12.012f, 11.0f)
                lineToRelative(-1.252f, -6.0f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.511f, 6.0f)
                horizontalLineToRelative(1.252f)
                lineToRelative(0.826f, -3.282f)
                lineToRelative(0.684f, 3.282f)
                horizontalLineToRelative(1.252f)
                close()
                moveTo(14.76f, 11.0f)
                lineToRelative(1.252f, -6.0f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(-0.684f, 3.282f)
                lineToRelative(-0.826f, -3.282f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(1.511f, 6.0f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(19.999f, 11.033f)
                lineToRelative(-1.252f, -6.0f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.511f, 6.0f)
                horizontalLineToRelative(1.252f)
                lineToRelative(0.826f, -3.282f)
                lineToRelative(0.684f, 3.282f)
                horizontalLineToRelative(1.252f)
                close()
            }
        }
        .build()
        return _javascript!!
    }

private var _javascript: ImageVector? = null
