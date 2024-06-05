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

public val Icons.Outline.AngleCircleDown: ImageVector
    get() {
        if (_angleCircleDown != null) {
            return _angleCircleDown!!
        }
        _angleCircleDown = Builder(name = "AngleCircleDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 16.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, true, -1.987f, -0.752f)
                curveToRelative(-0.327f, -0.291f, -0.637f, -0.574f, -0.84f, -0.777f)
                lineTo(6.3f, 11.647f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -1.426f)
                lineTo(10.58f, 13.05f)
                curveToRelative(0.188f, 0.187f, 0.468f, 0.441f, 0.759f, 0.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.323f, 0.0f)
                curveToRelative(0.29f, -0.258f, 0.57f, -0.512f, 0.752f, -0.693f)
                lineTo(16.3f, 10.221f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.426f)
                lineToRelative(-2.879f, 2.829f)
                curveToRelative(-0.2f, 0.2f, -0.507f, 0.48f, -0.833f, 0.769f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _angleCircleDown!!
    }

private var _angleCircleDown: ImageVector? = null
