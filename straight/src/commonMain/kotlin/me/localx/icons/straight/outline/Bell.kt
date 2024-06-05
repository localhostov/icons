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

public val Icons.Outline.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.259f, 16.2f)
                lineToRelative(-2.6f, -9.371f)
                arcTo(9.321f, 9.321f, 0.0f, false, false, 2.576f, 7.3f)
                lineTo(0.565f, 16.35f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.493f, 20.0f)
                lineTo(7.1f, 20.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 9.8f, 0.0f)
                horizontalLineToRelative(3.47f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.89f, -3.8f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.816f, -2.0f)
                horizontalLineToRelative(5.632f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(21.165f, 17.605f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.8f, 0.395f)
                lineTo(3.493f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.976f, -1.217f)
                lineToRelative(2.011f, -9.05f)
                arcToRelative(7.321f, 7.321f, 0.0f, false, true, 14.2f, -0.372f)
                lineToRelative(2.6f, 9.371f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 21.165f, 17.605f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
