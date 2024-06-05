package me.localx.icons.rounded.bold

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

public val Icons.Bold.RotateSquare: ImageVector
    get() {
        if (_rotateSquare != null) {
            return _rotateSquare!!
        }
        _rotateSquare = Builder(name = "RotateSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 6.281f)
                verticalLineToRelative(3.399f)
                curveToRelative(0.0f, 0.729f, -0.591f, 1.32f, -1.32f, 1.32f)
                horizontalLineToRelative(-0.774f)
                reflectiveCurveToRelative(-0.003f, 0.0f, -0.004f, 0.0f)
                curveToRelative(-0.001f, 0.0f, -0.002f, 0.0f, -0.004f, 0.0f)
                horizontalLineToRelative(-2.617f)
                curveToRelative(-0.695f, 0.0f, -1.042f, -0.84f, -0.551f, -1.331f)
                lineToRelative(0.783f, -0.783f)
                curveToRelative(-0.698f, -0.564f, -1.577f, -0.886f, -2.513f, -0.886f)
                curveToRelative(-1.511f, 0.0f, -2.877f, 0.836f, -3.564f, 2.183f)
                curveToRelative(-0.377f, 0.738f, -1.279f, 1.031f, -2.019f, 0.653f)
                curveToRelative(-0.737f, -0.377f, -1.03f, -1.28f, -0.653f, -2.018f)
                curveToRelative(1.204f, -2.354f, 3.593f, -3.817f, 6.236f, -3.817f)
                curveToRelative(1.749f, 0.0f, 3.377f, 0.651f, 4.634f, 1.765f)
                lineToRelative(1.035f, -1.035f)
                curveToRelative(0.491f, -0.491f, 1.331f, -0.143f, 1.331f, 0.551f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
                moveTo(17.583f, 13.165f)
                curveToRelative(-0.738f, -0.377f, -1.641f, -0.084f, -2.019f, 0.653f)
                curveToRelative(-0.688f, 1.346f, -2.054f, 2.183f, -3.564f, 2.183f)
                curveToRelative(-0.937f, 0.0f, -1.782f, -0.328f, -2.47f, -0.93f)
                lineToRelative(0.74f, -0.74f)
                curveToRelative(0.491f, -0.491f, 0.143f, -1.331f, -0.551f, -1.331f)
                horizontalLineToRelative(-3.399f)
                curveToRelative(-0.729f, 0.0f, -1.32f, 0.591f, -1.32f, 1.32f)
                verticalLineToRelative(3.399f)
                curveToRelative(0.0f, 0.695f, 0.84f, 1.042f, 1.331f, 0.551f)
                lineToRelative(1.073f, -1.073f)
                curveToRelative(1.251f, 1.16f, 2.856f, 1.803f, 4.596f, 1.803f)
                curveToRelative(2.644f, 0.0f, 5.032f, -1.463f, 6.236f, -3.817f)
                curveToRelative(0.377f, -0.738f, 0.084f, -1.641f, -0.653f, -2.018f)
                close()
            }
        }
        .build()
        return _rotateSquare!!
    }

private var _rotateSquare: ImageVector? = null
