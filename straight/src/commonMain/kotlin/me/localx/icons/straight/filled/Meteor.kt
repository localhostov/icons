package me.localx.icons.straight.filled

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

public val Icons.Filled.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 15.0f)
                close()
                moveTo(20.289f, 8.0f)
                horizontalLineToRelative(2.738f)
                lineToRelative(-0.61f, 1.4f)
                curveToRelative(-0.155f, 0.356f, -3.832f, 8.744f, -7.053f, 11.965f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 2.636f, 8.636f)
                curveTo(5.857f, 5.415f, 14.245f, 1.738f, 14.6f, 1.583f)
                lineTo(16.0f, 0.974f)
                lineTo(16.0f, 3.811f)
                lineTo(23.745f, 0.225f)
                close()
                moveTo(13.0f, 15.0f)
                curveToRelative(-0.138f, -5.275f, -7.863f, -5.274f, -8.0f, 0.0f)
                curveTo(5.138f, 20.275f, 12.863f, 20.274f, 13.0f, 15.0f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
