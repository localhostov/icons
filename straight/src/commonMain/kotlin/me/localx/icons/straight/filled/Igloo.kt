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

public val Icons.Filled.Igloo: ImageVector
    get() {
        if (_igloo != null) {
            return _igloo!!
        }
        _igloo = Builder(name = "Igloo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.105f, 7.0f)
                curveTo(2.873f, 3.164f, 6.599f, 0.416f, 11.0f, 0.051f)
                lineTo(11.0f, 7.0f)
                lineTo(1.105f, 7.0f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.037f, -0.146f, -2.039f, -0.395f, -3.0f)
                horizontalLineToRelative(-6.605f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(9.895f)
                curveTo(21.127f, 3.164f, 17.401f, 0.416f, 13.0f, 0.051f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(0.395f, 9.0f)
                curveToRelative(-0.249f, 0.961f, -0.395f, 1.963f, -0.395f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                lineTo(0.395f, 9.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(8.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 18.0f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(6.39f)
                curveToRelative(0.73f, -0.845f, 1.795f, -1.39f, 3.0f, -1.39f)
                reflectiveCurveToRelative(2.27f, 0.544f, 3.0f, 1.39f)
                verticalLineToRelative(-6.39f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _igloo!!
    }

private var _igloo: ImageVector? = null
