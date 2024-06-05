package me.localx.icons.rounded.outline

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

public val Icons.Outline.Interrogation: ImageVector
    get() {
        if (_interrogation != null) {
            return _interrogation!!
        }
        _interrogation = Builder(name = "Interrogation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.717f, 5.063f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.371f, -1.967f)
                arcToRelative(2.024f, 2.024f, 0.0f, false, true, 1.6f, 1.595f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 2.125f)
                arcTo(3.954f, 3.954f, 0.0f, false, false, 11.0f, 14.257f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-0.743f)
                arcToRelative(1.982f, 1.982f, 0.0f, false, true, 0.93f, -1.752f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.213f, -7.442f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 19.0f)
                lineTo(12.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _interrogation!!
    }

private var _interrogation: ImageVector? = null
