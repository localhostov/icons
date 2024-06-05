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

public val Icons.Filled.Blinds: ImageVector
    get() {
        if (_blinds != null) {
            return _blinds!!
        }
        _blinds = Builder(name = "Blinds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.416f, -2.0f, -2.829f)
                verticalLineToRelative(1.829f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 1.791f, 1.791f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                verticalLineToRelative(13.184f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(4.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 6.0f)
                close()
                moveTo(0.0f, 18.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(12.101f)
                curveToRelative(-0.066f, -0.323f, -0.101f, -0.657f, -0.101f, -1.0f)
                curveToRelative(0.0f, -1.131f, 0.39f, -2.162f, 1.023f, -3.0f)
                lineTo(0.0f, 18.0f)
                close()
            }
        }
        .build()
        return _blinds!!
    }

private var _blinds: ImageVector? = null
