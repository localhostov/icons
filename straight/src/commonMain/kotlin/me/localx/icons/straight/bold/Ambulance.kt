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

public val Icons.Bold.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = Builder(name = "Ambulance", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.562f)
                arcToRelative(6.445f, 6.445f, 0.0f, false, false, -0.561f, -2.641f)
                lineToRelative(-2.776f, -6.249f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.113f, -2.672f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(-0.507f, -2.03f)
                arcToRelative(1.281f, 1.281f, 0.0f, false, false, -2.486f, 0.0f)
                lineToRelative(-0.507f, 2.03f)
                horizontalLineToRelative(-7.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(3.05f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, false, -0.05f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, false, -0.05f, -0.5f)
                horizontalLineToRelative(8.1f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, false, -0.05f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, false, -0.05f, -0.5f)
                horizontalLineToRelative(3.05f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.636f)
                lineToRelative(0.062f, 0.14f)
                arcToRelative(3.478f, 3.478f, 0.0f, false, true, 0.3f, 1.422f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
