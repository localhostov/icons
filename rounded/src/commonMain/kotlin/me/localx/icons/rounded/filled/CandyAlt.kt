package me.localx.icons.rounded.filled

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

public val Icons.Filled.CandyAlt: ImageVector
    get() {
        if (_candyAlt != null) {
            return _candyAlt!!
        }
        _candyAlt = Builder(name = "CandyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.276f, 1.724f)
                curveToRelative(3.278f, 4.181f, 1.7f, 11.042f, -3.845f, 12.129f)
                arcTo(5.23f, 5.23f, 0.0f, false, true, 10.0f, 9.048f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, 4.148f, -4.975f)
                curveTo(18.66f, 3.352f, 19.487f, 9.7f, 15.0f, 10.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(3.01f, 3.01f, 0.0f, true, false, 0.635f, 5.96f)
                arcToRelative(5.043f, 5.043f, 0.0f, false, false, 4.334f, -5.617f)
                curveTo(19.446f, 0.748f, 12.368f, -1.267f, 8.488f, 2.8f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 8.0f, 14.588f)
                lineToRelative(-7.7f, 7.705f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineTo(9.416f, 16.0f)
                curveTo(19.211f, 23.33f, 29.856f, 9.157f, 20.276f, 1.724f)
                close()
            }
        }
        .build()
        return _candyAlt!!
    }

private var _candyAlt: ImageVector? = null
