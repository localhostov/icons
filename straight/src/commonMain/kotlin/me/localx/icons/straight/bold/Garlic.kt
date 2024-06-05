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

public val Icons.Bold.Garlic: ImageVector
    get() {
        if (_garlic != null) {
            return _garlic!!
        }
        _garlic = Builder(name = "Garlic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.669f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 5.669f)
                curveTo(5.86f, 7.087f, 0.0f, 11.573f, 0.0f, 18.2f)
                arcTo(4.823f, 4.823f, 0.0f, false, false, 4.841f, 23.0f)
                arcToRelative(5.152f, 5.152f, 0.0f, false, false, 3.195f, -1.17f)
                arcTo(4.9f, 4.9f, 0.0f, false, false, 16.0f, 22.072f)
                arcTo(5.829f, 5.829f, 0.0f, false, false, 19.159f, 23.0f)
                arcTo(4.823f, 4.823f, 0.0f, false, false, 24.0f, 18.2f)
                curveTo(24.0f, 11.573f, 18.14f, 7.087f, 16.0f, 5.669f)
                close()
                moveTo(13.0f, 3.0f)
                lineTo(13.0f, 5.853f)
                arcToRelative(7.779f, 7.779f, 0.0f, false, false, -1.0f, 1.492f)
                arcToRelative(7.779f, 7.779f, 0.0f, false, false, -1.0f, -1.492f)
                lineTo(11.0f, 3.0f)
                close()
                moveTo(4.841f, 20.0f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 3.0f, 18.2f)
                curveTo(3.0f, 13.463f, 7.207f, 9.91f, 9.206f, 8.489f)
                arcToRelative(8.715f, 8.715f, 0.0f, false, true, 0.563f, 1.155f)
                arcTo(13.671f, 13.671f, 0.0f, false, false, 7.016f, 18.0f)
                lineTo(7.0f, 18.0f)
                arcTo(2.291f, 2.291f, 0.0f, false, true, 4.841f, 20.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(2.339f, 2.339f, 0.0f, false, true, -2.0f, -2.522f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 1.988f, -6.823f)
                arcTo(12.035f, 12.035f, 0.0f, false, true, 14.0f, 18.978f)
                arcTo(1.885f, 1.885f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(19.159f, 20.0f)
                curveTo(18.121f, 20.0f, 17.0f, 19.427f, 17.0f, 18.5f)
                horizontalLineToRelative(-0.015f)
                arcToRelative(14.619f, 14.619f, 0.0f, false, false, -2.761f, -8.838f)
                arcTo(8.567f, 8.567f, 0.0f, false, true, 14.8f, 8.486f)
                curveTo(16.8f, 9.9f, 21.0f, 13.44f, 21.0f, 18.2f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 19.159f, 20.0f)
                close()
            }
        }
        .build()
        return _garlic!!
    }

private var _garlic: ImageVector? = null
