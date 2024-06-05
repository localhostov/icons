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

public val Icons.Outline.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 19.0f)
                close()
                moveTo(9.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 13.0f)
                close()
                moveTo(9.0f, 24.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 2.636f, 8.636f)
                curveTo(5.857f, 5.415f, 14.245f, 1.738f, 14.6f, 1.583f)
                lineTo(16.0f, 0.974f)
                lineTo(16.0f, 3.811f)
                lineTo(23.745f, 0.225f)
                lineTo(20.289f, 8.0f)
                horizontalLineToRelative(2.738f)
                lineToRelative(-0.61f, 1.4f)
                curveToRelative(-0.155f, 0.356f, -3.832f, 8.744f, -7.053f, 11.965f)
                arcTo(8.971f, 8.971f, 0.0f, false, true, 9.0f, 24.0f)
                close()
                moveTo(14.0f, 4.06f)
                curveToRelative(-2.514f, 1.18f, -7.736f, 3.781f, -9.95f, 5.994f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.9f, 9.9f)
                curveToRelative(2.214f, -2.214f, 4.814f, -7.436f, 5.994f, -9.95f)
                lineTo(17.211f, 10.004f)
                lineToRelative(2.544f, -5.725f)
                lineTo(14.0f, 6.939f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
