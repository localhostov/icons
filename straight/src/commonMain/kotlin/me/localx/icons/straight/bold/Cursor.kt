package me.localx.icons.straight.bold

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

public val Icons.Bold.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8111f, 13.2898f)
                lineTo(8.0151f, 0.5128f)
                curveTo(7.6446f, 0.2306f, 7.2027f, 0.0574f, 6.739f, 0.0129f)
                curveTo(6.2754f, -0.0316f, 5.8086f, 0.0543f, 5.3912f, 0.2608f)
                curveTo(4.9738f, 0.4674f, 4.6224f, 0.7865f, 4.3766f, 1.1821f)
                curveTo(4.1308f, 1.5777f, 4.0004f, 2.0341f, 4.0001f, 2.4998f)
                verticalLineTo(21.8068f)
                lineTo(10.3061f, 16.2428f)
                lineTo(14.1921f, 23.9998f)
                lineTo(18.5421f, 21.8248f)
                lineTo(14.7751f, 14.1818f)
                lineTo(22.8111f, 13.2898f)
                close()
                moveTo(7.0001f, 3.5998f)
                lineTo(15.6471f, 11.0688f)
                lineTo(10.7141f, 11.6138f)
                lineTo(7.0001f, 15.1598f)
                verticalLineTo(3.5998f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
