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

public val Icons.Bold.LaughSquint: ImageVector
    get() {
        if (_laughSquint != null) {
            return _laughSquint!!
        }
        _laughSquint = Builder(name = "LaughSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.6f, -3.9f, 23.4f, -3.893f, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, false, -9.0f, 9.0f)
                curveToRelative(0.452f, 11.923f, 17.549f, 11.92f, 18.0f, 0.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(15.5f, 14.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.468f, 1.468f, 0.0f, false, false, -1.268f, 2.2f)
                arcTo(5.865f, 5.865f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(5.865f, 5.865f, 0.0f, false, false, 4.767f, -2.8f)
                arcTo(1.468f, 1.468f, 0.0f, false, false, 15.5f, 14.0f)
                close()
                moveTo(8.4f, 11.7f)
                lineToRelative(2.0f, -1.5f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, 0.0f, -2.4f)
                lineToRelative(-2.0f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.6f, 8.7f)
                lineTo(7.0f, 9.0f)
                lineToRelative(-0.4f, 0.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.8f, 2.4f)
                close()
                moveTo(17.7f, 11.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.3f, -2.1f)
                lineTo(17.0f, 9.0f)
                lineToRelative(0.4f, -0.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.8f, -2.4f)
                lineToRelative(-2.0f, 1.5f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, 0.0f, 2.4f)
                lineToRelative(2.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.1f, -0.3f)
                close()
            }
        }
        .build()
        return _laughSquint!!
    }

private var _laughSquint: ImageVector? = null
