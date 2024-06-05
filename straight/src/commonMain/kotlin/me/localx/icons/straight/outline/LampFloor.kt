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

public val Icons.Outline.LampFloor: ImageVector
    get() {
        if (_lampFloor != null) {
            return _lampFloor!!
        }
        _lampFloor = Builder(name = "LampFloor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.0f)
                horizontalLineToRelative(7.844f)
                lineToRelative(-1.381f, -8.285f)
                curveToRelative(-0.262f, -1.573f, -1.61f, -2.715f, -3.205f, -2.715f)
                horizontalLineTo(7.743f)
                curveToRelative(-1.595f, 0.0f, -2.943f, 1.142f, -3.206f, 2.715f)
                lineToRelative(-1.381f, 8.285f)
                horizontalLineToRelative(7.844f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(6.509f, 3.044f)
                curveToRelative(0.101f, -0.605f, 0.62f, -1.044f, 1.233f, -1.044f)
                horizontalLineToRelative(8.515f)
                curveToRelative(0.613f, 0.0f, 1.132f, 0.439f, 1.232f, 1.044f)
                lineToRelative(0.992f, 5.956f)
                horizontalLineTo(5.517f)
                lineToRelative(0.992f, -5.956f)
                close()
            }
        }
        .build()
        return _lampFloor!!
    }

private var _lampFloor: ImageVector? = null
