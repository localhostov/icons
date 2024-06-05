package me.localx.icons.rounded.outline

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

public val Icons.Outline.Resources: ImageVector
    get() {
        if (_resources != null) {
            return _resources!!
        }
        _resources = Builder(name = "Resources", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(12.0f, 7.27f)
                lineTo(9.6f, 3.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.47f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(0.13f, 13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 15.0f)
                lineTo(5.29f, 15.0f)
                arcTo(6.91f, 6.91f, 0.0f, false, false, 5.0f, 17.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 14.0f, 0.0f)
                arcToRelative(6.91f, 6.91f, 0.0f, false, false, -0.29f, -2.0f)
                lineTo(23.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(24.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 3.0f)
                close()
                moveTo(2.73f, 13.0f)
                lineTo(7.86f, 4.11f)
                lineTo(11.29f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.0f, 3.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, -5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(22.0f, 13.0f)
                lineTo(17.74f, 13.0f)
                arcTo(7.07f, 7.07f, 0.0f, false, false, 14.0f, 10.29f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _resources!!
    }

private var _resources: ImageVector? = null
