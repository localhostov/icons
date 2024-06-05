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

public val Icons.Outline.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = Builder(name = "Ambulance", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.062f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, false, -0.517f, -2.438f)
                lineTo(20.706f, 6.375f)
                arcTo(4.007f, 4.007f, 0.0f, false, false, 17.05f, 4.0f)
                lineTo(14.0f, 4.0f)
                lineTo(13.243f, 0.97f)
                arcToRelative(1.281f, 1.281f, 0.0f, false, false, -2.486f, 0.0f)
                lineTo(10.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 7.0f)
                lineTo(0.0f, 20.0f)
                lineTo(2.041f, 20.0f)
                arcTo(3.465f, 3.465f, 0.0f, false, false, 2.0f, 20.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, -0.5f)
                horizontalLineToRelative(6.082f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, -0.5f)
                lineTo(24.0f, 20.0f)
                close()
                moveTo(18.878f, 7.188f)
                lineTo(20.572f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineToRelative(1.05f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.878f, 7.188f)
                close()
                moveTo(7.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(1.418f, 1.418f, 0.0f, false, true, 0.093f, -0.5f)
                lineTo(6.907f, 20.0f)
                arcTo(1.418f, 1.418f, 0.0f, false, true, 7.0f, 20.5f)
                close()
                moveTo(20.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(1.418f, 1.418f, 0.0f, false, true, 0.093f, -0.5f)
                horizontalLineToRelative(2.814f)
                arcTo(1.418f, 1.418f, 0.0f, false, true, 20.0f, 20.5f)
                close()
                moveTo(22.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.461f)
                lineToRelative(0.194f, 0.437f)
                arcTo(3.969f, 3.969f, 0.0f, false, true, 22.0f, 15.062f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 15.0f)
                lineTo(7.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                lineTo(5.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
