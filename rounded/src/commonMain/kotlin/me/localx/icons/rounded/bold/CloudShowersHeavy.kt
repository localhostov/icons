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

public val Icons.Bold.CloudShowersHeavy: ImageVector
    get() {
        if (_cloudShowersHeavy != null) {
            return _cloudShowersHeavy!!
        }
        _cloudShowersHeavy = Builder(name = "CloudShowersHeavy", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 24.0f)
                arcToRelative(1.479f, 1.479f, 0.0f, false, true, -0.474f, -0.077f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.949f, -1.9f)
                lineToRelative(2.0f, -6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.846f, 0.95f)
                lineToRelative(-2.0f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 24.0f)
                close()
                moveTo(7.923f, 22.975f)
                lineToRelative(2.0f, -6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.846f, -0.95f)
                lineToRelative(-2.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.949f, 1.9f)
                arcTo(1.479f, 1.479f, 0.0f, false, false, 6.5f, 24.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.923f, 22.975f)
                close()
                moveTo(19.077f, 19.885f)
                curveTo(26.03f, 16.9f, 25.44f, 6.489f, 17.812f, 4.923f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.325f, -0.242f)
                arcTo(8.237f, 8.237f, 0.0f, false, false, 8.558f, 0.141f)
                arcTo(8.125f, 8.125f, 0.0f, false, false, 2.025f, 6.793f)
                arcToRelative(8.289f, 8.289f, 0.0f, false, false, 0.034f, 2.952f)
                arcTo(0.428f, 0.428f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(5.824f, 5.824f, 0.0f, false, false, 0.769f, 9.148f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.668f, -2.492f)
                arcToRelative(2.805f, 2.805f, 0.0f, false, true, -0.418f, -4.437f)
                arcTo(3.416f, 3.416f, 0.0f, false, false, 5.0f, 9.173f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, true, -0.02f, -1.888f)
                arcToRelative(5.183f, 5.183f, 0.0f, false, true, 9.791f, -1.32f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, false, 2.448f, 1.9f)
                curveToRelative(4.731f, 0.95f, 4.94f, 7.45f, 0.7f, 9.251f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.154f, 2.77f)
                close()
            }
        }
        .build()
        return _cloudShowersHeavy!!
    }

private var _cloudShowersHeavy: ImageVector? = null
