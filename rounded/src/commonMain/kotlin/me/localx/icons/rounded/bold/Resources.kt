package me.localx.icons.rounded.bold

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

public val Icons.Bold.Resources: ImageVector
    get() {
        if (_resources != null) {
            return _resources!!
        }
        _resources = Builder(name = "Resources", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.0f, 4.5f)
                verticalLineToRelative(0.3f)
                lineTo(9.735f, 2.606f)
                arcTo(2.536f, 2.536f, 0.0f, false, false, 8.213f, 1.378f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.367f, 2.541f)
                lineTo(0.375f, 11.187f)
                arcToRelative(2.538f, 2.538f, 0.0f, false, false, -0.3f, 1.931f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 15.0f)
                lineTo(5.2f, 15.0f)
                arcToRelative(7.074f, 7.074f, 0.0f, true, false, 13.6f, 0.0f)
                horizontalLineToRelative(2.7f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 12.5f)
                verticalLineToRelative(-8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 2.0f)
                close()
                moveTo(3.37f, 12.0f)
                lineTo(7.532f, 4.791f)
                lineTo(10.542f, 10.0f)
                arcToRelative(7.052f, 7.052f, 0.0f, false, false, -3.613f, 2.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(4.074f, 4.074f, 0.0f, true, true, 4.074f, -4.074f)
                arcTo(4.079f, 4.079f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(21.0f, 12.0f)
                lineTo(17.071f, 12.0f)
                arcTo(7.473f, 7.473f, 0.0f, false, false, 14.0f, 10.138f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _resources!!
    }

private var _resources: ImageVector? = null
