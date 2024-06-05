package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.96f)
                arcTo(1.492f, 1.492f, 0.0f, false, true, 0.439f, 10.9f)
                lineTo(8.111f, 3.224f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 7.778f, 0.0f)
                lineTo(23.561f, 10.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.122f, 2.121f)
                lineTo(13.768f, 5.345f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.536f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(2.561f, 13.017f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 11.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.439f, -1.061f)
                lineTo(9.525f, 11.36f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, 4.95f, 0.0f)
                lineToRelative(9.086f, 9.081f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.119f)
                lineToRelative(-9.085f, -9.086f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(2.561f, 22.56f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 21.5f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

private var _chevronDoubleUp: ImageVector? = null
