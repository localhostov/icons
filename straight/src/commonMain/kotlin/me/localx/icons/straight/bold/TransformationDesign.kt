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

public val Icons.Bold.TransformationDesign: ImageVector
    get() {
        if (_transformationDesign != null) {
            return _transformationDesign!!
        }
        _transformationDesign = Builder(name = "TransformationDesign", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.329f, 0.0f)
                lineToRelative(-5.284f, 21.136f)
                lineToRelative(-0.045f, 2.864f)
                horizontalLineToRelative(11.671f)
                lineTo(23.955f, 2.864f)
                lineToRelative(0.045f, -2.864f)
                horizontalLineToRelative(-11.671f)
                close()
                moveTo(16.329f, 21.0f)
                horizontalLineToRelative(-6.157f)
                lineTo(14.671f, 3.0f)
                horizontalLineToRelative(6.157f)
                lineToRelative(-4.5f, 18.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(3.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(3.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.652f, 3.0f)
                horizontalLineToRelative(-2.652f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(3.223f)
                lineToRelative(-0.571f, 3.0f)
                close()
            }
        }
        .build()
        return _transformationDesign!!
    }

private var _transformationDesign: ImageVector? = null
