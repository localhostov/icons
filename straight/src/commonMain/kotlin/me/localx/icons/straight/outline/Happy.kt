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

public val Icons.Outline.Happy: ImageVector
    get() {
        if (_happy != null) {
            return _happy!!
        }
        _happy = Builder(name = "Happy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(17.666f, 15.746f)
                lineTo(16.336f, 14.252f)
                arcTo(7.508f, 7.508f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(7.509f, 7.509f, 0.0f, false, true, -4.334f, -1.746f)
                lineTo(6.334f, 15.746f)
                arcTo(9.454f, 9.454f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(9.454f, 9.454f, 0.0f, false, false, 17.666f, 15.746f)
                close()
                moveTo(10.0f, 11.0f)
                lineTo(10.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(14.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _happy!!
    }

private var _happy: ImageVector? = null
