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

public val Icons.Outline.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.873f, 11.021f)
                lineTo(5.127f, 11.021f)
                arcToRelative(2.126f, 2.126f, 0.0f, false, true, -1.568f, -3.56f)
                lineTo(10.046f, 0.872f)
                arcToRelative(2.669f, 2.669f, 0.0f, false, true, 3.939f, 0.034f)
                lineToRelative(6.431f, 6.528f)
                arcToRelative(2.126f, 2.126f, 0.0f, false, true, -1.543f, 3.587f)
                close()
                moveTo(5.011f, 8.837f)
                arcToRelative(0.115f, 0.115f, 0.0f, false, false, 0.0f, 0.109f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, false, 0.114f, 0.075f)
                lineTo(18.873f, 9.021f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, false, 0.114f, -0.075f)
                arcToRelative(0.109f, 0.109f, 0.0f, false, false, -0.022f, -0.135f)
                lineTo(12.528f, 2.276f)
                arcTo(0.7f, 0.7f, 0.0f, false, false, 12.0f, 2.021f)
                arcToRelative(0.664f, 0.664f, 0.0f, false, false, -0.5f, 0.221f)
                lineTo(5.01f, 8.838f)
                close()
                moveTo(12.0f, 24.011f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -1.985f, -0.887f)
                lineTo(3.584f, 16.6f)
                arcToRelative(2.125f, 2.125f, 0.0f, false, true, 1.543f, -3.586f)
                lineTo(18.873f, 13.014f)
                arcToRelative(2.125f, 2.125f, 0.0f, false, true, 1.568f, 3.558f)
                lineToRelative(-6.487f, 6.589f)
                arcTo(2.641f, 2.641f, 0.0f, false, true, 12.0f, 24.011f)
                close()
                moveTo(5.127f, 15.011f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, false, -0.092f, 0.209f)
                lineToRelative(6.437f, 6.534f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.528f, 0.257f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, false, 0.5f, -0.223f)
                lineToRelative(6.493f, -6.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.112f, 0.112f, 0.0f, false, false, 0.0f, -0.108f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, false, -0.114f, -0.074f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
