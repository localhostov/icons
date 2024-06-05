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

public val Icons.Outline.AngleCircleRight: ImageVector
    get() {
        if (_angleCircleRight != null) {
            return _angleCircleRight!!
        }
        _angleCircleRight = Builder(name = "AngleCircleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 2.0f, 12.0f)
                close()
                moveTo(15.414f, 10.586f)
                lineTo(10.7f, 5.874f)
                lineTo(9.289f, 7.288f)
                lineTo(14.0f, 12.0f)
                lineTo(9.327f, 16.673f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.673f, -4.673f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.828f)
                close()
            }
        }
        .build()
        return _angleCircleRight!!
    }

private var _angleCircleRight: ImageVector? = null
