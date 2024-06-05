package me.localx.icons.rounded.filled

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

public val Icons.Filled.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 170.667f)
                horizontalLineToRelative(139.52f)
                curveToRelative(-7.448f, -19.736f, -19.019f, -37.656f, -33.941f, -52.565f)
                lineToRelative(-74.325f, -74.368f)
                curveToRelative(-14.927f, -14.905f, -32.852f, -26.468f, -52.587f, -33.92f)
                verticalLineToRelative(139.52f)
                curveTo(298.667f, 161.115f, 308.218f, 170.667f, 320.0f, 170.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(468.821f, 213.333f)
                horizontalLineTo(320.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, -28.654f, -64.0f, -64.0f)
                verticalLineTo(0.512f)
                curveTo(252.565f, 0.277f, 249.131f, 0.0f, 245.653f, 0.0f)
                horizontalLineToRelative(-96.32f)
                curveTo(90.452f, 0.071f, 42.737f, 47.786f, 42.667f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(42.737f, 464.214f, 90.452f, 511.93f, 149.333f, 512.0f)
                horizontalLineToRelative(213.333f)
                curveToRelative(58.881f, -0.07f, 106.596f, -47.786f, 106.667f, -106.667f)
                verticalLineTo(223.68f)
                curveTo(469.333f, 220.203f, 469.056f, 216.768f, 468.821f, 213.333f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
