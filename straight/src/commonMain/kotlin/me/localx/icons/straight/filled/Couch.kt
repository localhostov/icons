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

public val Icons.Filled.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = Builder(name = "Couch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                curveTo(2.0f, 3.239f, 4.239f, 1.0f, 7.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(24.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _couch!!
    }

private var _couch: ImageVector? = null
