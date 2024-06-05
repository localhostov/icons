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

public val Icons.Bold.HatChef: ImageVector
    get() {
        if (_hatChef != null) {
            return _hatChef!!
        }
        _hatChef = Builder(name = "HatChef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 1.0f)
                arcToRelative(5.443f, 5.443f, 0.0f, false, false, -2.448f, 0.582f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, -8.1f, 0.0f)
                arcTo(5.443f, 5.443f, 0.0f, false, false, 5.5f, 1.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 4.0f, 11.792f)
                lineTo(4.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 11.792f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 18.5f, 1.0f)
                close()
                moveTo(18.5f, 9.0f)
                lineTo(17.0f, 9.0f)
                verticalLineToRelative(9.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 9.0f)
                lineTo(5.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 7.2f, 4.678f)
                lineTo(8.51f, 5.9f)
                lineToRelative(0.969f, -1.511f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, 5.042f, 0.0f)
                lineTo(15.49f, 5.9f)
                lineToRelative(1.315f, -1.222f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 18.5f, 9.0f)
                close()
            }
        }
        .build()
        return _hatChef!!
    }

private var _hatChef: ImageVector? = null
